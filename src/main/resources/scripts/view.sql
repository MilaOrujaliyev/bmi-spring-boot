 SELECT row_number() OVER () AS view_id,
    u.user_id,
    u.first_name,
    u.last_name,
    b.weight,
    b.height,
    b.create_date,
    c.classification_name,
    b.index_result
   FROM users u
     JOIN bmi_entry_result b ON u.user_id = b.user_id
     JOIN bmi_classification c ON b.classification_id = c.id;