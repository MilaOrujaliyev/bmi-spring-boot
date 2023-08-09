DECLARE
    v_index_result NUMERIC;
    v_classification_id INT;
BEGIN
    v_index_result := new_entry_result.weight / (new_entry_result.height * new_entry_result.height);

    SELECT id INTO v_classification_id
    FROM public.bmi_classification
    WHERE v_index_result >= lower_bound_index_range
        AND v_index_result <= upper_bound_index_range
    LIMIT 1;

    new_entry_result.index_result := v_index_result;
    new_entry_result.classification_id := v_classification_id;
END;