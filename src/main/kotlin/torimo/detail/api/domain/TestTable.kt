package torimo.detail.api.domain

import io.micronaut.configuration.hibernate.jpa.scope.CurrentSession
import io.micronaut.spring.tx.annotation.Transactional
import javax.inject.Singleton
import javax.persistence.EntityManager;
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

interface TestTableRepository {
    fun findById(id: @NotNull Long): TestTable?
}

@Singleton
open class TestTableImpl(@param:CurrentSession @field:PersistenceContext
                         private val entityManager: EntityManager)  : TestTableRepository {

    @Transactional(readOnly = true)
    override fun findById(id: Long): TestTable? {
        println("hogehoge")
        return entityManager.find(TestTable::class.java, id)
    }
}
