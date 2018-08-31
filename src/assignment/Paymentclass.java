/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Acer
 */
public class Paymentclass {
    
    private  int payment_id;
    private int student_id;
    private String subject_code;
    private int amount;
    private String date;

    /**
     * @return the payment_id
     */
    public int getPayment_id() {
        return payment_id;
    }

    /**
     * @return the student_id
     */
    public int getStudent_id() {
        return student_id;
    }

    /**
     * @return the subject_code
     */
    public String getSubject_code() {
        return subject_code;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param payment_id the payment_id to set
     */
    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    /**
     * @param student_id the student_id to set
     */
    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    /**
     * @param subject_code the subject_code to set
     */
    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    
    
    
    
}
