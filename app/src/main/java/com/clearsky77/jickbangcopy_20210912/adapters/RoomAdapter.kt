package com.clearsky77.jickbangcopy_20210912.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.clearsky77.jickbangcopy_20210912.R
import com.clearsky77.jickbangcopy_20210912.datas.RoomData
class RoomAdapter(
    val mContext: Context, //어느 화면에
    val resId: Int, //
    val mList: ArrayList<RoomData>) : ArrayAdapter<RoomData>(mContext, resId, mList) {

    val mInflater = LayoutInflater.from(mContext)


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView //임시로 한 줄에 해당하는 것을 만들어 줌.
        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.room_list_item, null) // R이라는 것은 res 폴더다!
        }
        val row = tempRow!! // null이 아니다는 뜻.
//        getView 작업의 결과물로 지정.
        val data = mList[position]

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt)

        priceTxt.text = data.getFormattedPrice()
        addressAndFloorTxt.text = "${data.address},${data.getFormattedFloor()}"
        descriptionTxt.text = data.description

        return row
    }
}

