package main.com.jc.beginner.oops.accessSpecifiers.account;

public class A1 {
    /**
     *  private access-specifier scope:
     *   1. With in the same class only
     *
     */
    private String privateName;

    private int privateId;

    /**
     *  public access-specifier scope:
     *   1. Can be accessed from anywhere with in the project
     *
     */
    public String publicName;

    public int publicId;

    /**
     *  default access-specifier scope:
     *   1. Can be accessed from anywhere with in the same PACKAGE
     *
     */
    String defaultName;

    int defaultId;

    /**
     *  protected access-specifier scope:
     *   1. Can be accessed from anywhere with in the same PACKAGE
     *   2. Also in the class that extends this class (i.e child/derived/sub-classes)
     *
     */
    protected String protectedName;
    protected int protectedId;







}
