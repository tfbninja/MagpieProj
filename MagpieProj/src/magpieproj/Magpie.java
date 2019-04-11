package MagpieProj;

/**
 *
 * @author Elliot and Ti
 */
public class Magpie {

    /**
     * Get a default greeting
     *
     * @return a greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user stmt
     *
     * @param stmt
     * the user stmt
     * @return a response based on the rules given
     */
    public String getResponse(String stmt) {
        stmt = stmt.toLowerCase().trim();
        String response = getRandomResponse();
        if (stmt.length() >= 1) {
            if (contains(stmt, "no") || contains(stmt, "not")) {
                response = "Why so negative?";
            } else if (contains(stmt, "mother")
                    || contains(stmt, "father")
                    || contains(stmt, "sister")
                    || contains(stmt, "brother")) {
                response = "Tell me more about your family.";
            } else if (contains(stmt, "dog") || contains(stmt, "cat")) {
                response = "Tell me more about your pets.";
            } else if (contains(stmt, "kranz")) {
                response = "Wow he sounds like a great teacher.";
            } else if (contains(stmt, "sun")
                    || contains(stmt, "cloud")
                    || contains(stmt, "rain")) {
                response = "I am immune to weather.";
            }
        } else {
            response = "Please say something.";
        }

        return response;
    }

    private boolean contains(String parent, String str) {
        char post = ' ';
        if (parent.length() > parent.indexOf(str) + str.length()) {
            post = parent.charAt(parent.indexOf(str) + str.length());
        } else if (parent.length() > str.length()) {
            return parent.contains(" " + str);
        } else if (parent.indexOf(str) == 0 && parent.length() == str.length()) {
            return true;
        }
        return parent.contains(str) && post == ' ' || post == '.' || post == ',' || post == '\'' || post == '\"';
    }

    /**
     * Pick a default response to use if nothing else fits.
     *
     * @return a non-committal string
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        switch (whichResponse) {
            case 0:
                response = "Interesting, tell me more.";
                break;
            case 1:
                response = "Hmmm.";
                break;
            case 2:
                response = "Do you really think so?";
                break;
            case 3:
                response = "You don't say.";
                break;
            default:
                break;
        }

        return response;
    }
}
