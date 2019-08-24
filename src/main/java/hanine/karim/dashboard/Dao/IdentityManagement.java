package hanine.karim.dashboard.Dao;


import hanine.karim.dashboard.Entities.IdentityStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentityManagement extends JpaRepository<IdentityStore, Long> {
}
