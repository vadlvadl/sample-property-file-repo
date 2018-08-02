public class Main {

    public static void main(String[] args) {

        // Path to .properties file
        String filePath = "/home/vadim/IdeaProjects/sample-property-file-repo/src/main/resources/jira.properties";

        PropertyReader propertyReader = new PropertyReader(filePath);

        System.out.println("jiraURL:    " + propertyReader.getStringValue("jiraURL"));
        System.out.println("jiraLogin:    " + propertyReader.getStringValue("jiraLogin"));
        System.out.println("configurationRemote:    " + propertyReader.getStringValue("configurationRemote"));
        System.out.println("configurationTimeout:    " + propertyReader.getIntValue("configurationTimeout"));
    }

}
