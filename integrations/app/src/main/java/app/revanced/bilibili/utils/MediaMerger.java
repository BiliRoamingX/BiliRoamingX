package app.revanced.bilibili.utils;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class MediaMerger {

    public static void merge(String videoPath, String audioPath, String outputPath) throws IOException {
        MediaExtractor videoExtractor = new MediaExtractor();
        MediaExtractor audioExtractor = new MediaExtractor();
        MediaMuxer mediaMuxer = new MediaMuxer(outputPath, MediaMuxer.OutputFormat.MUXER_OUTPUT_MPEG_4);
        try {
            mergeInternal(videoExtractor, audioExtractor, mediaMuxer, videoPath, audioPath);
        } finally {
            mediaMuxer.release();
            videoExtractor.release();
            audioExtractor.release();
        }
    }

    private static void mergeInternal(
            MediaExtractor videoExtractor, MediaExtractor audioExtractor, MediaMuxer mediaMuxer,
            String videoPath, String audioPath
    ) throws IOException {
        // Set up video extractor
        videoExtractor.setDataSource(videoPath);
        MediaFormat videoFormat = selectTrack(videoExtractor, "video/");
        int videoTrackIndex = mediaMuxer.addTrack(videoFormat);

        boolean hasAudio = new File(audioPath).isFile();
        int audioTrackIndex = -1;
        if (hasAudio) {
            // Set up audio extractor
            audioExtractor.setDataSource(audioPath);
            MediaFormat audioFormat = selectTrack(audioExtractor, "audio/");
            audioTrackIndex = mediaMuxer.addTrack(audioFormat);
        }

        // Start muxing
        mediaMuxer.start();

        // Copy video data
        copyTrack(videoExtractor, mediaMuxer, videoTrackIndex);

        if (hasAudio) {
            // Copy audio data
            copyTrack(audioExtractor, mediaMuxer, audioTrackIndex);
        }
    }

    private static MediaFormat selectTrack(MediaExtractor extractor, String mimeType) throws IOException {
        for (int i = 0; i < extractor.getTrackCount(); i++) {
            MediaFormat format = extractor.getTrackFormat(i);
            String mime = format.getString(MediaFormat.KEY_MIME);
            if (mime != null && mime.startsWith(mimeType)) {
                extractor.selectTrack(i);
                return format;
            }
        }
        throw new IOException(String.format("\"%s\" type track not found", mimeType));
    }

    @SuppressLint("WrongConstant")
    private static void copyTrack(MediaExtractor extractor, MediaMuxer muxer, int trackIndex) {
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        extractor.seekTo(0, MediaExtractor.SEEK_TO_CLOSEST_SYNC);
        ByteBuffer buffer = ByteBuffer.allocate(2 * 1024 * 1024);

        while (true) {
            int sampleSize = extractor.readSampleData(buffer, 0);
            if (sampleSize < 0) {
                break;
            }
            bufferInfo.size = sampleSize;
            bufferInfo.presentationTimeUs = extractor.getSampleTime();
            bufferInfo.flags = extractor.getSampleFlags();
            muxer.writeSampleData(trackIndex, buffer, bufferInfo);
            extractor.advance();
        }
    }
}
