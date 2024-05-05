package dev.alxndrestvs.efdreinf.repositories;

import dev.alxndrestvs.efdreinf.models.Reinf1000;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Reinf1000Repository extends JpaRepository<Reinf1000, Long> {
}
