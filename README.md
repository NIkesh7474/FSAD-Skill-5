# FullStack Skill-5 – Spring Autowiring Demo using @Autowired

**Student:** Y. AdithyaCharan | **ID:** 2400080194

## Overview
Demonstrates Spring Autowiring by injecting a `Certification` object into a `Student` object
using the `@Autowired` annotation — without using the `new` keyword.

## Tech Stack
- Java 17
- Spring Framework 6.1.2
- Maven

## Project Structure
```
src/main/java/com/fsad/autowire/
├── Certification.java        # @Component — dependency bean
├── Student.java              # @Component — uses @Autowired + @Value
├── AppConfig.java            # @Configuration + @ComponentScan (Java config)
├── MainApp.java              # Loads IoC via XML config
└── MainAppAnnotation.java    # Loads IoC via Annotation config

src/main/resources/
└── applicationContext.xml    # XML config with component-scan
```

## How to Run

```bash
mvn clean compile exec:java
```

## Key Annotations Used

| Annotation | Applied On | Purpose |
|---|---|---|
| `@Component` | `Certification`, `Student` | Marks classes as Spring beans |
| `@Autowired` | `Student.certification` | Field injection — no `new` keyword |
| `@Value` | `Student.id/name/gender` | Injects literal values into fields |
| `@Configuration` | `AppConfig` | Marks as Java config class |
| `@ComponentScan` | `AppConfig` | Scans `com.fsad.autowire` for beans |

## Expected Output
```
--- Student Details ---
Student [id=101, name=AdithyaCharan, gender=Male,
  certification=Certification [id=0, name=null, dateOfCompletion=null]]
Certification: Certification [id=0, name=null, dateOfCompletion=null]

--- Student Details (Annotation Config) ---
Student [id=101, name=AdithyaCharan, gender=Male,
  certification=Certification [id=0, name=null, dateOfCompletion=null]]
```
