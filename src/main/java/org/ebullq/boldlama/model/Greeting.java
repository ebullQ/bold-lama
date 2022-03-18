package org.ebullq.boldlama.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

/**
 * @author mkukharchuk 18.03.2022
 */
@Data
@AllArgsConstructor
@FieldDefaults(level = PRIVATE, makeFinal = true)
public class Greeting {
    String message;
}
