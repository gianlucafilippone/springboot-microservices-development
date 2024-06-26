INSERT INTO "role" ("created_at", "updated_at", "description", "name") VALUES ('2020-01-09 15:41:00', '2020-01-09 15:41:00', 'System administrator', 'admin');
INSERT INTO "role" ("created_at", "updated_at", "description", "name") VALUES ('2020-01-09 15:41:00', '2020-01-09 15:41:00', 'Applicant user', 'applicant');
INSERT INTO "role" ("created_at", "updated_at", "description", "name") VALUES ('2020-01-09 15:41:00', '2020-01-09 15:41:00', 'Job manager', 'job');

INSERT INTO "users" ("created_at", "updated_at", "active", "email", "first_name", "last_name", "password", "password_expired", "username") VALUES ('2020-01-09 15:41:00', '2020-01-09 15:41:00', TRUE, 'admin.admin@gmail.com', 'Admin', 'Admin', 'admin', FALSE, 'admin');
INSERT INTO "users" ("created_at", "updated_at", "active", "email", "first_name", "last_name", "password", "password_expired", "username") VALUES ('2020-01-09 15:41:00', '2020-01-09 15:41:00', TRUE, 'applicant.applicant@gmail.com', 'Applicant', 'Applicant', 'applicant', FALSE, 'applicant');
INSERT INTO "users" ("created_at", "updated_at", "active", "email", "first_name", "last_name", "password", "password_expired", "username") VALUES ('2020-01-09 15:41:00', '2020-01-09 15:41:00', TRUE, 'job.job@gmail.com', 'Job', 'Job', 'job', FALSE, 'job');

INSERT INTO "user_role" ("user_id", "role_id") VALUES ('1', '1');
INSERT INTO "user_role" ("user_id", "role_id") VALUES ('2', '2');
INSERT INTO "user_role" ("user_id", "role_id") VALUES ('3', '3');