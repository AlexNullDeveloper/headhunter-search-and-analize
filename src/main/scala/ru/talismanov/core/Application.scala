package ru.talismanov.core

import com.google.gson.Gson
import ru.talismanov.beans.VacanciesResponse
import ru.talismanov.util.MapUtils

import scala.collection.mutable

class Application {

  val javaSkills: Set[String] = Set("REST", "core", "Core", "JavaEE", "юнит-тест", "MySQL", "MS SQL", "Oracle", "MongoDB", "JUnit",
    "JDBC", "Swing", "SQL", "Intellij Idea", "HTML", "XML", "XSL", "UML", "C++", "C/C++", "ASP", "Java Script",
    "JavaScript", "CORBA", "PHP", "Pascal", "Delphi", "JSP", "Servlets", "JTS", "JMS", "Struts", "Hibernate", "JSF",
    "JAAS", "JNDI", "JWS", "JAXP", "EJB", "Ant", "Log4J", "AWT", "SWING", "Thread", "JDBC", "RMI", "JBoss", "WebLogic",
    "WebSphere", "Tomcat", "Glassfish", "Linux", "Oracle", "DB2", "C#", "Scala", "Kotlin", "kotlin", "Groovy", "C++", "Go", "SOA", "Docker",
    "Spring", "AspectJ", "JMS", "jms", "quartz", "Guava", "Jmeter", "Haskel", "Python", "Akka", "Spark", "Hadoop", "NoSQL",
    "Cassandra", "Git", "SVN", "Mercurial", "CUDA", "ElasticSearch", "Machine Learning", "Jenkins", "Kubernetes", "EDA",
    "Ansible", "ansible", "ReactJS", "AngularJS", "REST", "JPA", "HTML5", "DevOps",
    "H2", "WildFly", "Gitlab", "Zkoss", "Spring security", "Spring MVC", "Java SE", "Java EE", "Oracle SQL", "PL/SQL",
    "XSLT", "SOAP", "JAXB", "GWT", "WebLogic", "WebSphere", "JBoss", "EJB", "JSON", "GSON", "Gson", "eclipse", "Eclipse",
    "AJAX", "JS", "WSDL", "XSD", "JMS", "RabbitMQ", "JSF", "JTA", "JIXB", "JAXB", "ORM", "JMX", "JVM", "Inversion of Control",
    "JDO", "iBatis", "MyBatis", "Ant", "Maven", "Gradle", "Apache POI", "Desgin Patterns", "EasyMock", "Jackson", "JasperReports",
    "Generics", "RMI", "java.reflect", "java.time", "Java 8", "Java 9", "JavaFx", "JavaMail", "Jbpm5", "JFreeChart", "JOGL", "JSoup", "jsoup",
    "JSP", "log4j", "slf4j", "logback", "Lucene", "PDFbox", "Spring AOP", "Spring Batch", "Spring Boot", "Spring Web Services", "TestNG", "testng",
    "Tika", "Xerces", "XStream", "Dart", "JCL", "Node.js", "Kafka", "Apache Pig", "Apache Solr", "Apache Storm", "Apache Tajo",
    "CouchDB", "Hadoop", "HBase", "Hive", "Map Reduce", "Android", "jQuery", "Perl", "PHP", "PyQt", "Unix", "Ruby", "Lua",
    "J2EE", "J2ME", "NetBeans", "JBuilder", "JDeveloper", "XQuery", "XPath", "SAX", "DOM", "JAXP", "JAX-WS", "JAX-RS", "JAX-RPC", "UDDI", "JRun"
    , "J2CA", "JNDI", "JTA", "JMS", "DHTML", "VBscript", "Facelets", "Primeface", "Iceface", "Beehive", "JSTL", "Tapestry", "Apache Camel",
    "ExtJS", "TypeScript", "Applet", "Java 2D", "IDL", "RMI-IIOP", "Collections", "NIO", "Java 7", "FindBugs", "SQL Developer", "Nexus", "StAX", "Clojure", "Ceylon", "Xtend",
    "Ivy", "SBT", "JDBC Template", "JOOQ", "Bamboo", "Hudson", "TeamCity", "Travis CI", "CruiseControl", "JRebel", "RxJava", "XRebel", "Play 1", "Play 2", "Vaadin", "Grails",
    "Wicket", "Dropwizard", "Retrofit", "Jetty", "WLP", "Neo4j", "Hudson", "CVS", "VisualWM", "Java Mission Control", "Mesos", "AWS ECS", "Agile", "New Relic", "Sparkjava",
    "YourKit", "JProbe", "JProfiler", "LDAP", "IoC"
  )

  //  val zaglushkaDlyaOtveta: Array[String] = Array("Хорошее знание core <highlighttext>Java</highlighttext>. Большой опыт разработки JavaEE-приложений. Опыт разработки REST-сервисов. Знание инструментов юнит-тестирования в <highlighttext>Java</highlighttext>.", "Имеете уверенные знания языка программирования <highlighttext>Java</highlighttext>, возможностей <highlighttext>java</highlighttext>7\\<highlighttext>java</highlighttext>8, JDK, инструментов разработки. Имеете опыт многопоточного программирования. REST")

  var skillCountMap: mutable.Map[String, Int] = scala.collection.mutable.Map[String, Int]()

  def run(): Unit = {

    val gson = new Gson()
    //    https://api.hh.ru/vacancies?text=java&per_page=100&page=19

    try {
      1.to(19).foreach(counter => {
        println(counter)
        //        val responseStr = scala.io.Source.fromURL("https://api.hh.ru/vacancies?text=java&per_page=100&page=" + counter).mkString

        val responseStr = scala.io.Source.fromURL("https://api.hh.ru/vacancies?text=java&per_page=1&page=" + counter).mkString


        val gsonResponse = gson.fromJson(responseStr, classOf[VacanciesResponse])

        println(gsonResponse.keySkills)

        gsonResponse.getItems.forEach(elem => {
          val requirement = elem.getSnippet.requirement
          if (requirement != null) {
            for (skill <- javaSkills) {
              if (requirement.contains(skill)) {
                MapUtils.incrementByOne(skill, skillCountMap)
              }
            }
          }
        })

        Thread.sleep(2000)
      })
    } catch {
      case e: Exception => e.printStackTrace();
    }

    MapUtils.fromMapToReversedSequenceAndPrint(skillCountMap)
  }


}
