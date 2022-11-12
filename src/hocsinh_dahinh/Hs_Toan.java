/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hocsinh_dahinh;

/**
 *
 * @author admin
 */
public class Hs_Toan extends Hocsinh {
    @Override
    public float DTB(){
       return (super.getToan()*2 + super.getTin())/3;
    }
    public void Output(){
        System.out.println("Hoc sinh chuyen toan: ");
    }
    
}
