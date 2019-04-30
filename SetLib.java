package interfaceconfig;

public class SetLib implements LibName, LibBooks {

    @Override
    public String setCollegeName(String s) {
        return("College name is " + s + "\n");
    }

    @Override
    public String setLibName(String s) {
        return("Library Name is " + s + "\n");

    }

    @Override
    public String setCityname(String s) {
        return("City name is " + s +"\n");

    }

    @Override
    public String setTitle(String s) {
        return ("title name is " + s + "\n");

    }

    @Override
    public String setAuthor(String s) {
        return ("Author name is " + s + "\n");
    }

    @Override
    public String setPublisher(String s) {
        return ("Publisher name is " + s +"\n");

    }

    @Override
    public String setYear(String s) {
        return ("Year of publishing is " +s + "\n");
    }

    @Override
    public String setBookPrice(String s) {
        return ("Price of the book is " +s + "\n");
    }
}
