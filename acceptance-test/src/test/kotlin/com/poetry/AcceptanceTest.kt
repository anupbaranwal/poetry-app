package com.poetry

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class AcceptanceTest {

    /*@Test
    fun `should get verse when asked for poetry`() {
        val poetryReader: RequestVerse = PoetryReader()
        val verse = poetryReader.getPoetry()
        Assertions.assertEquals("Twinkle Twinkle little star", verse)
    }*/

    /*@Test
    fun `should be able to get verses when asked for poetry from a poetry library`(@Mock obtainPoem: ObtainPoem) {
        Mockito.lenient().`when`(obtainPoem.getMeSomePoetry()).thenReturn("Jonny Jonny Yes Pappa")
        val poetryReader: RequestVerse = PoetryReader(obtainPoem)
        val verse = poetryReader.getPoetry()
        Assertions.assertEquals("Jonny Jonny Yes Pappa", verse)
    }*/

    /*@Test
    fun `should be able to get verses when asked for poetry from a poetry file library`() {
        val obtainPoem: ObtainPoem = PoemFileAdapter()
        val poetryReader: RequestVerse = PoetryReader(obtainPoem)
        val verse = poetryReader.getPoetry()
        Assertions.assertEquals("Humpty dumpty sat on a wall!", verse)
    }*/
}