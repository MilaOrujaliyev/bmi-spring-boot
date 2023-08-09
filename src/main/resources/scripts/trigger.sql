BEGIN
    CALL calculate_index_result(NEW);
    RETURN NEW;
END;