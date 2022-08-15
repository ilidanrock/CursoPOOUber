<?php

require_once('account.php');
class Car {
  public $id;
  public $license;
  public $drive ;
  public $passengers ;

  public function __construct( $license, $drive) {

    $this->license = $license;
    $this->drive = $drive;
  }

  public function PrintDataCar(){
    echo "license: $this->license, conductor: {$this->driver->name}";
  }
}

?>