package com.example.ProjectLaptopStore.Util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import static org.apache.tomcat.util.http.FastHttpDateFormat.parseDate;

//lớp này dùng để lấy các phần tử trong map (được lấy từ giao diện) và chuyển đổi kiểu dữ liệu
public class MapUtil {
    public static <T> T getObject(Map<String,Object> params, String key, Class<T> tClass) {
        Object obj = params.getOrDefault(key,null);
        if(obj!=null){
            if(tClass.getTypeName().equals("java.lang.Long")){
                obj = obj != ""? Long.valueOf(obj.toString()) :null;
            }
            else if(tClass.getTypeName().equals("java.lang.Integer")){
                obj =obj != ""? Integer.valueOf(obj.toString()) : null;
            }
            else if(tClass.getTypeName().equals("java.lang.Double")){
                obj =obj != ""? Double.valueOf(obj.toString()) : null;
            }
            //dính lỗi Cannot cast java.lang.String to java.util.Date
//            else if(tClass.getTypeName().equals("java.lang.Date")){
//                obj =obj != ""? parseDate(obj.toString()) : null;
//            }
            else if(tClass.getTypeName().equals("java.util.Date")){
                // Chuyển đổi chuỗi thành Date (ví dụ 2024-10-06)
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Định dạng ngày phù hợp với chuỗi đầu vào
                try {
                    obj = obj != ""? sdf.parse(obj.toString()) : null;
                } catch (ParseException e) {
                    e.printStackTrace();
                    obj = null; // Hoặc xử lý lỗi theo cách bạn muốn
                }
            }
            else if(tClass.getTypeName().equals("java.lang.String")){
                obj = obj.toString();
            }
            else if (tClass.getTypeName().equals("java.math.BigDecimal")) {
                obj = new BigDecimal(obj.toString());
            }
            return tClass.cast(obj);
        }
        return null;

    }
}
