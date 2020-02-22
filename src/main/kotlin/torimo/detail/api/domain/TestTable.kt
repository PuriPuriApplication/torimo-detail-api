package torimo.detail.api.domain

import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@Table(name = "test_table")
class TestTable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: @NotNull Long? = null

    @Column(name = "name", nullable = false, unique = true)
    private val name: @NotNull String? = null
}
