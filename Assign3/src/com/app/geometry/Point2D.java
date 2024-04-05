package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	 private double x;
	    private double y;
	    Scanner sc = new Scanner(System.in);

	    public Point2D(double x, double y) {
	        this.x = x;
	        this.y = y;
	    }

	    public String getDetails() {
	        return "(" + x + ", " + y + ")";
	    }

	    public boolean isEqual(Point2D other) {
	        return this.x == other.x && this.y == other.y;
	    }

	  
	    public double getX() {
			return x;
		}

		public void setX(double x) {
			this.x = x;
		}

		public double getY() {
			return y;
		}

		public void setY(double y) {
			this.y = y;
		}

		public double calculateDistance(Point2D p2) 
		{
	      double dx = this.getX() - p2.getX();
	      double dy = this.getY() - p2.getY();
	      return Math.sqrt(dx * dx + dy * dy);
	  }


}
