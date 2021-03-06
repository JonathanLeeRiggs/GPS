package GIS;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import Coords.myCoords;
import Geom.Point3D;

/**
 * this class represents pacman. pacman has id, latitude, longitude, altitude, speed and radius.
 */
public class Pacman {

	/**
	 * this method is a constructor.
	 */
	public Pacman() {
		id=0;
		lat=0;
		lon=0;
		alt=0;
		speed=1;
		radius=1;
		score=0;
	}
	/**
	 * this method is a constructor.
	 */
	public Pacman(int id, double lat, double lon, double alt, double speed, double radius, int score) {
		this.id=id;
		this.lat=lat;
		this.lon=lon;
		this.alt=alt;
		this.speed=speed;
		this.radius=radius;
		this.score=score;
	}
	/**
	 * this method is a copy constructor.
	 */
	public Pacman(Pacman p) {
		this.id=p.id;
		this.lat=p.lat;
		this.lon=p.lon;
		this.alt=p.alt;
		this.speed=p.speed;
		this.radius=p.radius;
		this.score=p.score;
	}

	/**
	 * this method creating a point out of a pacman.
	 * @param pac: the given pacman.
	 */
	public Point3D pacToPoint() {
		Point3D point = new Point3D(this.getLat(), this.getLon(), this.getAlt());
		return point;
	}
	/**
	 * this method returns the time from a pacman to a fruit
	 * by calculate the distance between them, and divides it by the pacman's speed.
	 * @param fru: the given fruit.
	 */
	public double timePacToFruit(Fruit fru) {
		double time=0;
		Point3D point=fru.fruitToPoint();
		myCoords m = new myCoords();
		double dist=m.distance3d(point, this.pacToPoint());
		time=dist/this.getSpeed();
		return time;

	}

	public String toString() {
		String s="Pacman id: "+id+" ,lat: "+lat+" ,lon: "+lon+" ,alt: "+alt+" ,speed: "+speed+" ,radius: "+radius+" ,score: "+score;
		return s;
	}

	/**
	 * this method returns the pacman's id.
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * this method returns the pacman's latitude.
	 */
	public double getLat() {
		return lat;
	}

	/**
	 * this method returns the pacman's longitude.
	 */
	public double getLon() {
		return lon;
	}

	/**
	 * this method returns the pacman's altitude.
	 */
	public double getAlt() {
		return alt;
	}

	/**
	 * this method returns the pacman's speed.
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * this method returns the pacman's radius.
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * this method returns the pacman's score.
	 */
	public int getScore() {
		return score;
	}

	/**
	 * this method sets the pacman's latitude.
	 */
	public void setLat(double lat) {
		this.lat = lat;
	}
	
	/**
	 * this method sets the pacman's longitude.
	 */
	public void setLon(double lon) {
		this.lon = lon;
	}
	
	/**
	 * this method sets the pacman's altitude.
	 */
	public void setAlt(double alt) {
		this.alt = alt;
	}
	
	/**
	 * this method sets the pacman's score.
	 */
	public void setScore(int score) {
		this.score = score;
	}


	//////private//////
	private int id;
	private double lat;
	private double lon;
	private double alt;
	private double speed;
	private double radius=1;
	private int score;
	
}
