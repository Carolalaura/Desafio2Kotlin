package cl.desafiolatam.desafiodos.orm

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DAO {
    @Query("SELECT * FROM task")
    fun getAll(): List<Task>

    @Query("select * from task where uid = :id")
    fun loadId(id: Long): List<Task>

    @Insert
    fun insert(task: Task)

    @Delete
    fun delete(task: Task)

    @Query("UPDATE task SET text=(:text) WHERE uid = (:id)")
    fun update(text: String, id: Long?)

    @Query("DELETE FROM task")
    fun delete()

}