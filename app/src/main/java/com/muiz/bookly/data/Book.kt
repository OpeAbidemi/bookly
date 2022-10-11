package com.muiz.bookly.data

import java.io.Serializable

data class Book(
    val title: String,
    var description: String,
    val author: String,
    val rating: Double,
    val noOfPages: Int,
    val imageUrl: String,
    val price: Double,
    val language: String,
    val year: String,
    val categories: List<String>
): Serializable {
    companion object {
        val books = arrayListOf(
            Book(
                "A Touch of Darkness",
                "Persephone is the Goddess of Spring by title only. The truth is, since she was a little girl, flowers have shriveled at her touch. After moving to New Athens, she hopes to lead an unassuming life disguised as a mortal journalist. Hades, God of the Dead, has built a gambling empire in the mortal world and his favorite bets are rumored to be impossible. After a chance encounter with Hades, Persephone finds herself in a contract with the God of the Dead and the terms are impossible: Persephone must create life in the Underworld or lose her freedom forever. The bet does more than expose Persephone’s failure as a goddess, however. As she struggles to sow the seeds of her freedom, love for the God of the Dead grows—and it’s forbidden.",
                "Scarlett St Clair",
                4.2,
                370,
                "https://covers.zlibcdn2.com/covers299/books/4a/ce/13/4ace136b7e51f12d96851ff09e209122.jpg",
                2.4,
                "English",
                "2019",
                listOf("Romance", "Fantasy")
            ),
            Book(
                "From Blood and Ash",
                "Captivating and action-packed, From Blood and Ash is a sexy, addictive, and unexpected fantasy perfect for fans of Sarah J. Maas and Laura Thalassa. A Maiden… Chosen from birth to usher in a new era, Poppy’s life has never been her own. The life of the Maiden is solitary. Never to be touched. Never to be looked upon. Never to be spoken to. Never to experience pleasure. Waiting for the day of her Ascension, she would rather be with the guards, fighting back the evil that took her family, than preparing to be found worthy by the gods. But the choice has never been hers. A Duty… The entire kingdom’s future rests on Poppy’s shoulders, something she’s not even quite sure she wants for herself. Because a Maiden has a heart. And a soul. And longing. And when Hawke, a golden-eyed guard honor bound to ensure her Ascension, enters her life, destiny and duty become tangled with desire and need. He incites her anger, makes her question everything she believes in, and tempts her with the",
                "James Bond",
                5.0,
                622,
                "https://covers.zlibcdn2.com/covers299/books/ea/9c/18/ea9c18d32fd1d9d907bcba383dd7ada3.jpg",
                2.4,
                "English",
                "2020",
                listOf("Science", "Fantasy")
            ),
            Book(
                "Atomic Habits",
                "No matter your goals, Atomic Habits offers a proven framework for improving--every day. James Clear, one of the world's leading experts on habit formation, reveals practical strategies that will teach you exactly how to form good habits, break bad ones, and master the tiny behaviors that lead to remarkable results.",
                "James Clear",
                4.7,
                285,
                "https://covers.zlibcdn2.com/covers299/books/72/9a/66/729a66f87a5a6ceb910e60038fca86f8.jpg",
                0.0,
                "English",
                "2018",
                listOf("Lifestyle", "Growth")
            ),
            Book(
                "Milk and Honey",
                "#1 New York Times bestseller Milk and Honey is a collection of poetry and prose about survival. About the experience of violence, abuse, love, loss, and femininity.\n" +
                        "\n" +
                        "The book is divided into four chapters, and each chapter serves a different purpose. Deals with a different pain. Heals a different heartache. Milk and Honey takes readers through a journey of the most bitter moments in life and finds sweetness in them because there is sweetness everywhere if you are just willing to look.",
                "Rupi Kaur",
                5.0,
                208,
                "https://covers.zlibcdn2.com/covers299/books/8f/9b/6b/8f9b6bffceef958de0c6d7f33914f166.png",
                0.0,
                "English",
                "2015",
                listOf("Poetry")
            ),
            Book(
                "We hunt the Flame",
                "Zafira is the Hunter, disguising herself as a man when she braves the cursed forest of the Arz to feed her people. Nasir is the Prince of Death, assassinating those foolish enough to defy his autocratic father, the sultan. If Zafira was exposed as a girl, all of her achievements would be rejected; if Nasir displayed his compassion, his father would punish him in the most brutal of ways. Both Zafira and Nasir are legends in the kingdom of Arawiya—but neither wants to be.",
                "Hafsah Faizal",
                3.2,
                472,
                "https://covers.zlibcdn2.com/covers299/books/de/5a/a4/de5aa4ebcaf144ef969762dd311b4931.jpg",
                7.79,
                "English",
                "2019",
                listOf("Fantasy", "Fiction")
            )
        )
    }
}