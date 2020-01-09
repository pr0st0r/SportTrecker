package ru.prostor.fitnessroom.core.db.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Класс описывающий состояния настройки для подходов
 */
@Entity
data class Approach(
    @PrimaryKey
    private val id: Int,
    @ColumnInfo(name = "count")
    private val mCount: Int
)