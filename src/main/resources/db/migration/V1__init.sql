CREATE TABLE members
(
    member_id BIGINT AUTO_INCREMENT,
    email     VARCHAR(255)  NOT NULL,
    status    VARCHAR(20)   NOT NULL,
    created_at datetime(6)  NOT NULL,
    updated_at datetime(6)  NOT NULL,
    PRIMARY KEY (member_id)
);