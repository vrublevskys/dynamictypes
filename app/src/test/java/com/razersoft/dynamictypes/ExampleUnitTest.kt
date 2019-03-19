package com.razersoft.dynamictypes

import com.razersoft.dynamictypes.data.Message
import com.razersoft.dynamictypes.data.Message_
import com.razersoft.dynamictypes.data.MyObjectBox
import com.razersoft.dynamictypes.data.payloads.VideoPayload
import com.razersoft.dynamictypes.data.types.MessageType
import io.objectbox.BoxStore
import org.junit.After
import org.junit.Before
import org.junit.Test
import java.io.File

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Before
    fun setUp() {
        BoxStore.deleteAllFiles(testDirectory)
        boxStore = MyObjectBox.builder()
            .directory(testDirectory)
            .build()
    }

    @Test
    fun boxTest() {
//        val videoMessage = Message(0, MessageType.Video)
//        val imageMessage = Message(0, MessageType.Image)
//        val messageBox = boxStore.boxFor(Message::class.java)
//        messageBox.put(videoMessage, imageMessage)
//
//        val newVideoMessage: Message<VideoPayload> = messageBox.query()
//            .equal(Message_.messageType, "Video")
//            .build().findFirst() as Message<VideoPayload>
//
//        val videoPayload: VideoPayload = newVideoMessage.getPayload()
//        videoPayload.
    }

    @After
    fun tearDown() {
        boxStore.close()
        BoxStore.deleteAllFiles(testDirectory)
    }

    companion object {

        val testDirectory = File("objectbox-example/test-db")

        lateinit var boxStore: BoxStore
    }
}
