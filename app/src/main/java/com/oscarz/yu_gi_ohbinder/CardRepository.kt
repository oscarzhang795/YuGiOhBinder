package com.oscarz.yu_gi_ohbinder

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CardRepository @Inject constructor(
    private val webService: WebService,
    private val cardDao: CardDao
) {

}