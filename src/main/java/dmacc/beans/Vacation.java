/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Mar 5, 2023
 */
package dmacc.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Vacation {
	@Id
	@GeneratedValue
	private long id;
	private String resortName;
	private int milesFromHome;
	private boolean visted;
	private char grade;
	/**
	 * 
	 */
	public Vacation() {
		super();
		setGrade('F');
	}
	/**
	 * @param resortName
	 * @param milesFromHome
	 */
	public Vacation(String resortName, int milesFromHome) {
		super();
		setResortName(resortName);
		setMilesFromHome(milesFromHome);
	}
	/**
	 * @param id
	 * @param resortName
	 * @param milesFromHome
	 * @param visted
	 * @param grade
	 */
	public Vacation(String resortName, int milesFromHome, boolean visted, char grade) {
		super();
		setResortName(resortName);
		setMilesFromHome(milesFromHome);
		setVisted(visted);
		setGrade(grade);
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the resortName
	 */
	public String getResortName() {
		return resortName;
	}
	/**
	 * @param resortName the resortName to set
	 */
	public void setResortName(String resortName) {
		this.resortName = resortName;
	}
	/**
	 * @return the milesFromHome
	 */
	public int getMilesFromHome() {
		return milesFromHome;
	}
	/**
	 * @param milesFromHome the milesFromHome to set
	 */
	public void setMilesFromHome(int milesFromHome) {
		this.milesFromHome = milesFromHome;
	}
	/**
	 * @return the visted
	 */
	public boolean isVisted() {
		return visted;
	}
	/**
	 * @param visted the visted to set
	 */
	public void setVisted(boolean visted) {
		this.visted = visted;
	}
	/**
	 * @return the grade
	 */
	public char getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(char grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Vacation [id=" + id + ", resortName=" + resortName + ", milesFromHome=" + milesFromHome + ", visted="
				+ visted + ", grade=" + grade + "]";
	}
}
