package hanine.karim.dashboard.Dao;

import hanine.karim.dashboard.Entities.Identity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDstore extends JpaRepository<Identity, Long> {
}
