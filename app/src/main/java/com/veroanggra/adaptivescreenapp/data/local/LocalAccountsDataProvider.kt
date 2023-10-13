package com.veroanggra.adaptivescreenapp.data.local

import com.veroanggra.adaptivescreenapp.R
import com.veroanggra.adaptivescreenapp.data.Account

object LocalAccountsDataProvider {

    private val allUserAccounts = mutableListOf(
        Account(
            1L,
            0L,
            "Jeff",
            "Hansen",
            "hikingfan@gmail.com",
            "hkngfan@outside.com",
            R.drawable.avatar_10,
            true
        ),
        Account(
            2L,
            0L,
            "Jeff",
            "H",
            "jeffersonloveshiking@gmail.com",
            "jeffersonloveshiking@work.com",
            R.drawable.avatar_2
        ),
        Account(
            3L,
            0L,
            "Jeff",
            "Hansen",
            "jeffersonc@google.com",
            "jeffersonc@gmail.com",
            R.drawable.avatar_9
        )
    )

    private val allUserContactAccounts = listOf(
        Account(
            4L,
            1L,
            "Tracy",
            "Alvarez",
            "tracealvie@gmail.com",
            "tracealvie@gravity.com",
            R.drawable.avatar_1
        ),
        Account(
            5L,
            2L,
            "Allison",
            "Trabucco",
            "atrabucco222@gmail.com",
            "atrabucco222@work.com",
            R.drawable.avatar_3
        ),
        Account(
            6L,
            3L,
            "Ali",
            "Connors",
            "aliconnors@gmail.com",
            "aliconnors@android.com",
            R.drawable.avatar_5
        ),
        Account(
            7L,
            4L,
            "Alberto",
            "Williams",
            "albertowilliams124@gmail.com",
            "albertowilliams124@chromeos.com",
            R.drawable.avatar_0
        ),
        Account(
            8L,
            5L,
            "Kim",
            "Alen",
            "alen13@gmail.com",
            "alen13@mountainview.gov",
            R.drawable.avatar_7
        ),
        Account(
            9L,
            6L,
            "Google",
            "Express",
            "express@google.com",
            "express@gmail.com",
            R.drawable.avatar_express
        ),
        Account(
            10L,
            7L,
            "Sandra",
            "Adams",
            "sandraadams@gmail.com",
            "sandraadams@textera.com",
            R.drawable.avatar_2
        ),
        Account(
            11L,
            8L,
            "Trevor",
            "Hansen",
            "trevorhandsen@gmail.com",
            "trevorhandsen@express.com",
            R.drawable.avatar_8
        ),
        Account(
            12L,
            9L,
            "Sean",
            "Holt",
            "sholt@gmail.com",
            "sholt@art.com",
            R.drawable.avatar_6
        ),
        Account(
            13L,
            10L,
            "Frank",
            "Hawkins",
            "fhawkank@gmail.com",
            "fhawkank@thisisme.com",
            R.drawable.avatar_4
        )
    )

    /**
     * Get the current user's default account.
     */
    fun getDefaultUserAccount() = allUserAccounts.first()

    /**
     * Whether or not the given [Account.id] uid is an account owned by the current user.
     */
    fun isUserAccount(uid: Long): Boolean = allUserAccounts.any { it.uid == uid }


    /**
     * Get the contact of the current user with the given [accountId].
     */
    fun getContactAccountByUid(accountId: Long): Account {
        return allUserContactAccounts.firstOrNull { it.id == accountId }
            ?: allUserContactAccounts.first()
    }
}