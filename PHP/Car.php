<?php

require_once('Account.php');
class Car {
  public $id;
  public $license;
  public $drive ;
  public $passengers ;

  public function __construct( $license, $drive) {

    $this->license = $license;
    $this->drive = $drive;
  }
}

?>