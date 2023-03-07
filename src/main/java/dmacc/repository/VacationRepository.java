/**
 * @author Julie Burger - jaburger
 * CIS175 - Spring 2023
 * Mar 5, 2023
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Vacation;

@Repository
public interface VacationRepository extends JpaRepository<Vacation, Long> {

}
