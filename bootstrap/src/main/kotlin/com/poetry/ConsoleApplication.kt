package com.poetry

class ConsoleApplication
fun main() {
    val poetryReader: RequestVerse = PoetryReader()
    val consoleAdapter: ConsoleAdapter = ConsoleAdapter(poetryReader)
    consoleAdapter.writeThePoetryToTheConsole()
}