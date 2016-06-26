--insert data
INSERT INTO tblplayer (USERNAME, PASSWORD) VALUES ('daniel', 'change-it');
UPDATE tblplayer SET password=digest('n7fJkfgNM2bcy6YQLmR9yhr9r30T1Nyn'||'test'||id, 'sha256') WHERE username = 'daniel';
