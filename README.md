# Flyway

## Flyway
- Flyway는 데이터베이스의 형상관리를 목적으로 하는 툴
  - 소스 코드를 git을 이용해서 관리하는 것처럼 flyway는 데이터베이스 소스코드를 관리
- Flyway는 버전 관리 목적인 SCHEMA_VERSION 테이블을 통해 SQL 스크립트의 변화를 추적하면서 자동적으로 관리

## 적용
### 의존성 추가
```gradle
implementation("org.flywaydb:flyway-core")
```
DBMS가 MySQL 8.X 버전이거나, MariaDB를 사용한다면 아래 의존성도 추가
```gradle
implementation("org.flywaydb:flyway-mysql")
```

### DataSource, JPA 설정
```yaml
spring:
  # ...
  jpa:
    hibernate:
      ddl-auto: validate
  flyway:
    enabled: true
```

## 실습
### 환경
- SpringBoot 3.1.6
- Spring Data JPA
- MySQL 8

### JPA Entity
```kotlin
@Entity
@Table(name = "members")
class Member (
  @Column(nullable = false)
  var email: String,

  @Enumerated(EnumType.STRING)
  @Column(length = 20, nullable = false)
  var status: MemberStatus,

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "member_id")
  val id: Long? = null,
) : BaseTimeEntity()
```





## Reference
- https://github.com/flyway/flyway
- https://dallog.github.io/dallog-flyway