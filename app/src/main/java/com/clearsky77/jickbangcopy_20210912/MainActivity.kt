package com.clearsky77.jickbangcopy_20210912

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.clearsky77.jickbangcopy_20210912.adapters.RoomAdapter
import com.clearsky77.jickbangcopy_20210912.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()
    lateinit var mRoomAdapter: RoomAdapter //lateinit은 나중에 쓴다는 뜻.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //임시방편: 코드에 타이핑해서 추가
        mRoomList.add(RoomData(9000, "서울시 동대문구", 5, "1번째 방입니다."))
        mRoomList.add(RoomData(6000, "서울시 동대문구", 5, "1번째 방입니다."))
        mRoomList.add(RoomData(9000, "서울시 동대문구", 0, "1번째 방입니다."))
        mRoomList.add(RoomData(8000, "서울시 동대문구", 5, "1번째 방입니다."))
        mRoomList.add(RoomData(9000, "서울시 동대문구", -1, "1번째 방입니다."))
        mRoomList.add(RoomData(10000, "서울시 동대문구", 1, "1번째 방입니다."))
        mRoomList.add(RoomData(12000, "서울시 동대문구", 3, "1번째 방입니다."))
        mRoomList.add(RoomData(30000, "서울시 동대문구", 10, "1번째 방입니다."))

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mRoomAdapter //main.xml에 listView의 어댑터가 되도록.

    }
}