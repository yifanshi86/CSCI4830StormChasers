/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weather.dao;
import lombok.Data;

/**
 *
 * @author yifan
 */
@Data
public class DailyData {
    
    
    private Float temp_high;
    
    private Float temp_low;

    private int  hour;

    private Float Precipitation;
    
    

}
