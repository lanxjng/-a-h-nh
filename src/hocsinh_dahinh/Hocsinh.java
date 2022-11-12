/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hocsinh_dahinh;

/**
 *
 * @author admin
 */
public class Hocsinh {
    private String Hoten;
    private float toan,tin;
    public float getToan(){
        return toan;
    }
    public float getTin(){
        return tin;
    }
    public float DTB(){
        return (toan+tin)/2;
    }
    
}
