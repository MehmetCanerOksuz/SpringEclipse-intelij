package com.caneroksuz.model;

import com.sun.xml.bind.v2.model.core.ID;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "AGENTS")
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @Column(name = "AGENT_NAME", length = 50)
    private String agentName;
    @Column(name = "EMAIL", length = 60)
    private String email;
    @Column(name = "PHONE", length = 40)
    private String phone;
    @Column(name = "OFFICE_ADDRESS", length = 80)
    private String officeAddress;

    @OneToMany(mappedBy = "agent", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Property> properties = new HashSet<>();
}
