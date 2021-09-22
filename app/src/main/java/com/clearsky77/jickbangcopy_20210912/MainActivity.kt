package com.clearsky77.jickbangcopy_20210912

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.clearsky77.jickbangcopy_20210912.adapters.RoomAdapter
import com.clearsky77.jickbangcopy_20210912.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()
    lateinit var mRoomAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(RoomData(9000, "서울시 동대문구", 5, "1번째 방입니다."))
        mRoomList.add(RoomData(6000, "서울시 동대문구", 5, "1번째 방입니다."))
        mRoomList.add(RoomData(9000, "서울시 동대문구", 0, "1번째 방입니다."))
        mRoomList.add(RoomData(8000, "서울시 동대문구", 5, "1번째 방입니다."))
        mRoomList.add(RoomData(9000, "서울시 동대문구", -1, "1번째 방입니다."))
        mRoomList.add(RoomData(10000, "서울시 동대문구", 1, "1번째 방입니다."))
        mRoomList.add(RoomData(12000, "서울시 동대문구", 3, "1번째 방입니다."))
        mRoomList.add(RoomData(30000, "서울시 동대문구", 10, "1번째 방입니다."))

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mRoomAdapter

        roomListView.setOnItemClickListener { adapterView, view, position, l ->
            val clickedRoom = mRoomList[position]
            val myIntent = Intent(this, ViewRoomDetailActivity::class.java)
            myIntent.putExtra("roomData",clickedRoom)

            startActivity(myIntent)
        }
    }
}