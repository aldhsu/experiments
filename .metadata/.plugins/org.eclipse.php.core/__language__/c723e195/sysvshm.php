<?php

// Start of sysvshm v.

/**
 * Creates or open a shared memory segment
 * @link http://www.php.net/manual/en/function.shm-attach.php
 * @param key int <p>
 * A numeric shared memory segment ID
 * </p>
 * @param memsize int[optional] <p>
 * The memory size. If not provided, default to the
 * sysvshm.init_mem in the &php.ini;, otherwise 10000
 * bytes.
 * </p>
 * @param perm int[optional] <p>
 * The optional permission bits. Default to 0666.
 * </p>
 * @return resource a shared memory segment identifier.
 */
function shm_attach ($key, $memsize = null, $perm = null) {}

/**
 * Removes shared memory from Unix systems
 * @link http://www.php.net/manual/en/function.shm-remove.php
 * @param shm_identifier resource <p>
 * The shared memory identifier as returned by
 * shm_attach
 * </p>
 * @return bool Returns true on success or false on failure.
 */
function shm_remove ($shm_identifier) {}

/**
 * Disconnects from shared memory segment
 * @link http://www.php.net/manual/en/function.shm-detach.php
 * @param shm_identifier resource <p>
 * A shared memory resource handle as returned by
 * shm_attach
 * </p>
 * @return bool shm_detach always returns true.
 */
function shm_detach ($shm_identifier) {}

/**
 * Inserts or updates a variable in shared memory
 * @link http://www.php.net/manual/en/function.shm-put-var.php
 * @param shm_identifier resource <p>
 * A shared memory resource handle as returned by
 * shm_attach
 * </p>
 * @param variable_key int <p>
 * The variable key.
 * </p>
 * @param variable mixed <p>
 * The variable. All variable types
 * that serialize supports may be used: generally
 * this means all types except for resources and some internal objects
 * that cannot be serialized.
 * </p>
 * @return bool Returns true on success or false on failure.
 */
function shm_put_var ($shm_identifier, $variable_key, $variable) {}

/**
 * Check whether a specific entry exists
 * @link http://www.php.net/manual/en/function.shm-has-var.php
 * @param shm_identifier resource <p>
 * Shared memory segment, obtained from shm_attach.
 * </p>
 * @param variable_key int <p>
 * The variable key.
 * </p>
 * @return bool true if the entry exists, otherwise false
 */
function shm_has_var ($shm_identifier, $variable_key) {}

/**
 * Returns a variable from shared memory
 * @link http://www.php.net/manual/en/function.shm-get-var.php
 * @param shm_identifier resource <p>
 * Shared memory segment, obtained from shm_attach.
 * </p>
 * @param variable_key int <p>
 * The variable key.
 * </p>
 * @return mixed the variable with the given key.
 */
function shm_get_var ($shm_identifier, $variable_key) {}

/**
 * Removes a variable from shared memory
 * @link http://www.php.net/manual/en/function.shm-remove-var.php
 * @param shm_identifier resource <p>
 * The shared memory identifier as returned by
 * shm_attach
 * </p>
 * @param variable_key int <p>
 * The variable key.
 * </p>
 * @return bool Returns true on success or false on failure.
 */
function shm_remove_var ($shm_identifier, $variable_key) {}

// End of sysvshm v.
?>
