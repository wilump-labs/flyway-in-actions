package com.example.demo.domain

import jakarta.persistence.*

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