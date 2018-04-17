/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C:\\Users\\hansenestruchp0969\\Desktop\\pixLab\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testKeepOnlyBlue()
  {
	  Picture beachblue = new Picture("C:\\Users\\hansenestruchp0969\\Desktop\\pixLab\\images\\beach.jpg");
	  beachblue.explore();
	  beachblue.keepOnlyBlue();
	  beachblue.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\Users\\hansenestruchp0969\\Desktop\\pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\Users\\Philippe\\Desktop\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture temple = new Picture("C:\\Users\\Philippe\\Desktop\\images\\snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture temple = new Picture("C:\\Users\\Philippe\\Desktop\\images\\seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  public static void testCopy()
  {
    Picture temple = new Picture("C:\\Users\\Philippe\\Desktop\\images\\seagull.jpg");
    temple.explore();
    temple.Copy(temple,0,400,0,400);
    temple.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("C:\\Users\\Philippe\\Desktop\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  public static void testMyCollage()
  {
    Picture canvas = new Picture("C:\\Users\\Philippe\\Desktop\\images\\640x480.jpg");
    canvas.createMyCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\Users\\Philippe\\Desktop\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("C:\\Users\\Philippe\\Desktop\\images\\swan.jpg");
    swan.edgeDetection2(swan,10);
    swan.explore();
  }
  
  public static void testNegate()
  {
    Picture swan = new Picture("C:\\Users\\hansenestruchp0969\\Desktop\\pixLab\\images\\swan.jpg");
    swan.explore();
    swan.negate();
    swan.explore();
  }
  
  public static void testGrayscale()
  {
    Picture swan = new Picture("C:\\Users\\hansenestruchp0969\\Desktop\\pixLab\\images\\swan.jpg");
    swan.explore();
    swan.grayscale();
    swan.explore();
  }
  
  public static void testClearBlueOverValue(int value)
  {
    Picture swan = new Picture("C:\\Users\\Philippe\\Desktop\\images\\swan.jpg");
    swan.explore();
    swan.ClearBlueOverValue(value);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testMyCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}