package com.example.flaecherechteckberechnen;

    public class Rechteck {

        private double height;
        private double width;

        public double getHeight() {
            return height;
        }
        public void setHeight(double value) {
            height = value;
        }

        public double getWidth() {
            return width;
        }
        public void setWidth(double width) {
            this.width = width;
        }

        public double GetArea() {
            return height + width;
        }

        public double getArea() {
            return height * width;
        }


      /*  public char[] getArea() {
            return new char[0];
        } */



        /*public Object getArea(){
            String result = String.valueOf(height * width);
            return null;
            }
         */
        }


