-- ============================
--   Database & Table Setup
-- ============================

-- 1. 데이터베이스 생성
CREATE DATABASE IF NOT EXISTS grade_db
DEFAULT CHARACTER SET utf8mb4
COLLATE utf8mb4_general_ci;

USE grade_db;

-- 2. 학생 테이블 생성
DROP TABLE IF EXISTS students;

CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,         -- 고유 학번 (자동 증가)
    name VARCHAR(50) NOT NULL,                 -- 학생 이름
    major VARCHAR(50) NOT NULL,                -- 전공
    score DECIMAL(5,2) CHECK (score >= 0),     -- 점수 (0~100)
    reg_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP -- 등록일
);

-- 3. 샘플 데이터 삽입
INSERT INTO students (name, major, score) VALUES
('김기태', '컴퓨터공학', 92.5),
('김대철', '기계공학', 85.3),
('함창훈', '경영학', 78.9),
('김경희', '전자공학', 88.0),
('송미선', '디자인학', 95.7);

-- 4. 데이터 확인
SELECT * FROM students;

-- ============================
-- ✅ Index & Constraints (옵션)
-- ============================

-- 이름 검색 속도 향상을 위한 인덱스
CREATE INDEX idx_students_name ON students(name);