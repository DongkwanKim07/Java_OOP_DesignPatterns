/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Provided for lab03 by professor.
 * Student name : Dongkwan Kim
 * Student number : 040993905
 * Course & Section # : 22S_CST8288_010_013
 * Professor: George Kriger and Siju Philip
 * Description: Demonstration of javaFX Model view present pattern
 * Declaration : This is my own original work and is free from plagiarism.
 */

package model;

import javafx.beans.property.StringProperty;

/**
 * class that implements "model" for an MVC application that calculates Shannon's Theorem
 * @author Dongkwan Kim
 */
public class ShannonsTheorem {
	private double bandWidth;
	private double signalToNoiseRatio;
    //    private double maxDataRatio;
	/**
         * multi-argument constructor
	 * @param bandWidth the bandwidth in Hertz
	 * @param signalToNoiseRatio SNR in dB
	 */
	public ShannonsTheorem(double bandWidth, double signalToNoiseRatio) {
		this.bandWidth = bandWidth;
		this.signalToNoiseRatio = signalToNoiseRatio;
	}
	/**
	 * no-arg constructor sets fields to zero
	 */
	public ShannonsTheorem() {
		this(0.0, 0.0);
	}
	/**
	 * @return the bandWidth
	 */
	public double getBandWidth() {
		return bandWidth;
	}
	/**
	 * @param bandWidth the bandWidth to set
	 */
	public void setBandWidth(double bandWidth) {
		this.bandWidth = bandWidth;
	}
        
//        public final StringProperty bandWidty(){
//                return bandWidth;
//        }
        
	/**
	 * @return the signalToNoiseRatio
	 */
	public double getSignalToNoiseRatio() {
		return signalToNoiseRatio;
	}
	/**
	 * @param signalToNoiseRatio the signalToNoiseRatio to set
	 */
	public void setSignalToNoiseRatio(double signalToNoiseRatio) {
		this.signalToNoiseRatio = signalToNoiseRatio;
	}
        /**
         * 
         * @return the maxDataRatio
         */
  //      public double getMaxDataRatio(){
  //          return maxDataRatio;
  //      }
        /**
         * 
         * @param maxDataRatio the maxDataRatio to set
         */
 //       public void setMaxDataRatio(double maxDataRatio){
 //               this.maxDataRatio = maxDataRatio;
 //       }
	
	private double log2(double x) {
		return Math.log(x)/Math.log(2);
	}
	
    /**
     *
     * @param BW the bandwidth
     * @param SNR the signal-to-noise-ratio
     * @return maximum data ratio
     */
    public double maxDataRate(double BW, double SNR) {
		double SN = Math.pow(10, SNR/10);
		return BW*log2(1+SN);
	}
	
    /**
     *
     * @return maximum data Rate
     */
    public double maxDataRate() {
		return maxDataRate(bandWidth, signalToNoiseRatio);
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

    /**
     *
     * @return string for output
     */

	@Override
	public String toString() {
		return "ShannonsTheory [bandWidth=" + bandWidth + ", signalToNoiseRatio=" + signalToNoiseRatio + "]";
	}
	
	
	
}
