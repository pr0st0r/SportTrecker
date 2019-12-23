package ru.prostor.fitnessroom.core.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import ru.prostor.fitnessroom.core.db.entity.Approach

@Dao
interface ApproachDao {
    @Insert
    fun insertApproach(approach: Approach)

    @Query("SELECT * FROM Approach")
    fun getApproach(): Approach
}