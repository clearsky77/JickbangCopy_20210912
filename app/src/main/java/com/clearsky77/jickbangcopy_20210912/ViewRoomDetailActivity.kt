package com.clearsky77.jickbangcopy_20210912

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.clearsky77.jickbangcopy_20210912.datas.RoomData

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val room = intent.getSerializableExtra("roomData") as RoomData
        //roomData라는 이름의 짐을 받는데, RoomData의 형태로 받는다.



    }
}