package InnerAndOutter;

    public class Outer {

      private String outerName;

      public Outer(String outerName) {
        this.outerName = outerName;
      }

      public void setOuterName(String outerName) {
        this.outerName = outerName;
      }

      public String getOuterName() {
        return outerName;
      }

      public class Inner {
        public void printOuterName() {
          System.out.println("Outer Name: " + getOuterName());
        }

        public void updateOuterName(String newName) {
          setOuterName(newName);
          System.out.println("Updated Outer Name: " + getOuterName());
        }
      }

      static class inner2 {
        public void printMessage() {
          System.out.println("This is a static inner class.");
          }
      }
    }