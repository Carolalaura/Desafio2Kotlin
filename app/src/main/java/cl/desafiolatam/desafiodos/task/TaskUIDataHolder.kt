package cl.desafiolatam.desafiodos.task

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task")
data class TaskUIDataHolder (
    var id:Long,
    var text:String)

@PrimaryKey(autoGenerate = true)
var uid: Int? = null





