    // Add to POM.XML file
    //    JSP 
        <dependency>
                <groupId>org.apache.tomcat.embed</groupId>
                <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>
       
    // JSTL TAGS: Allows us to just JSTL tags in our web INF
       <dependency>
                <groupId>javax.servlet</groupId>
                <artifactId>jstl</artifactId>
        </dependency>


    // Bootstrap Dependencies 
        // <!-- webjars locator dependency enables auto-detection of the version, so your .jsp 
        // file links are version-agnostic in case you update the versions here in your pom later -->
    <dependency>
        <groupId>org.webjars</groupId>
        <artifactId>webjars-locator</artifactId>
        <version>0.30</version>
    </dependency>
    
    // <!-- BOOTSTRAP DEPENDENCIES -->
    <dependency>
        <groupId>org.webjars</groupId>
        <artifactId>bootstrap</artifactId>
        <version>5.0.1</version>
    </dependency>
    <dependency>
        <groupId>org.webjars</groupId>
        <artifactId>jquery</artifactId>
        <version>3.6.0</version>
    </dependency>

    // Must add on top of jsp file to use JSTL tags
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

    // <!-- ADD ONTO THE HEAD of JSP: for Bootstrap CSS -->
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    // <!-- YOUR own local CSS -->
    <link rel="stylesheet" href="/css/main.css"/>
    // <!-- For any Bootstrap that uses JS or jQuery-->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>


    // Add to our main/resources folder
    // Add to application.properties: Creates path to our WEB-INF folder
    spring.mvc.view.prefix=/WEB-INF/


    // import Session to your Controller
    import javax.servlet.http.HttpSession;